## How to run the application - Using IDE:

    1)Install Java JDK 17+,Maven,IntelliJ IDEA

    2)Run using Intellij IDEA-By clicking the run button in the ItemapiApplication java file.

## How to run the application - Command line:

    1) Needs Java, Maven
    
    2) Go to project folder containing the pom.xml file, src folder

    3) Run the following command "mvnw spring-boot:run"

## Local Testing with PostMan

    -Choose method POST
    -URL: http://localhost:8080/api/items
    -Go to Body → raw → JSON
    -Paste JSON and click Send

## How to try the application

The app is hosted in the following url - https://itemapi-production-6ddc.up.railway.app/api

    - To add new Item-Request Body Json
    POST Request - Endpoint - /items
        {
            "name": "Laptop",
            "description": "Gaming laptop",
            "price": 55000
        }

    JSON Response
        "id": 1,
        "name": "Laptop",
        "description": "Gaming laptop",
        "price": 55000.0

    2) Get Item By ID

    GET Request - Endpoint - /items/{id}
    where id is the id of the product you need details for
    
    GET Request Response
        {
            "id": 1,
            "name": "Laptop",
            "description": "Gaming laptop",
            "price": 55000.0
        }

Input Validation

    -name must not be empty
    -price must be greater than 0
    -If invalid data is sent, the API returns 400 Bad Request
Example Error Response:

    {
        "status": 400,
        "error": "Bad Request",
        "message": "Name is required"
    }
        


