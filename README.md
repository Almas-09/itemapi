How to Run the Application:

    1)Install Java JDK 17+,Maven,IntelliJ IDEA

    2)Run using Intellij IDEA-By clicking the run button in the ItemapiApplication java file.
    
    3)To add new Item-Request Body Json
        {
            "name": "Laptop",
            "description": "Gaming laptop",
            "price": 55000
        }

    4)Response
        "id": 1,
        "name": "Laptop",
        "description": "Gaming laptop",
        "price": 55000.0

    5)Get Item By ID-Response
        {
            "id": 1,
            "name": "Laptop",
            "description": "Gaming laptop",
            "price": 55000.0
        }

    6)Input Validation
        -name must not be empty
        -price must be greater than 0
        -If invalid data is sent, the API returns 400 Bad Request
    Example Error:
        {
            "status": 400,
            "error": "Bad Request",
            "message": "Name is required"
        }

    7)Testing with postman
        -Choose method POST
        -URL: http://localhost:8080/api/items
        -Go to Body → raw → JSON
        -Paste JSON and click Send
        


