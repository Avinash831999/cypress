const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    baseUrl: "http://localhost:8085/signature-service/", // Set your API's base URL
    setupNodeEvents(on, config) {
      // implement node event listeners here if needed
    },
  },
});
