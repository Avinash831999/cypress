describe("Problem Analysis API Functional Tests", () => {
  beforeEach(() => {
    // Intercept all the GET requests to the external API
    cy.intercept(
      "GET",
      "http://localhost:8081/druid-service/getdata",
      (req) => {
        // Call another API to get mock data
        cy.request(
          "GET",
          "http://localhost:8082/mock-service/getmockdata"
        ).then((apiResponse) => {
          console.log("Mocked response: ", apiResponse.body);
          // Mock the response with the data from the mock API
          req.reply({
            statusCode: 200,
            body: apiResponse.body, // Use mock data here
          });
        });
      }
    ).as("mockedExternalApi1");
  });

  it("should analyze problems correctly using mocked API responses", () => {
    cy.wait("@mockedExternalApi1").then(() => {
      // Now log the request after the wait
      console.log("Intercepted request completed");
    });

    console.log("Hello world");
    // Send a GET request to the /signature endpoint of your Spring Boot app
    cy.request("GET", "/signature").then((response) => {
      // Check if the Spring Boot application is working fine
      expect(response.status).to.eq(200);
      expect(response.body).to.eq("Druid data from Mock API"); // Check if the response matches the mock data
    });
  });
});
