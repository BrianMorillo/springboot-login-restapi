
# Springboot Login REST API

Springboot Login RESTAPI server implementing jsonwebtoken


## Run Locally

Clone the project

```bash
  git clone https://github.com/BrianMorillo/springboot-login-restapi.git
```

Go to the project directory

```bash
  cd springboot-login-restapi
```

run maven project

```bash
  mvnw spring-boot:run
```

## Usage/Examples

Call endpoint with sample request body 

```bash
http://localhost:8080/api/auth/login
```

```bash
{
    "email": "john.doe@example.com",
    "password": "password1"
}
```

Succesful response with jwt generated access token
```bash
{
    "message": "Login successful",
    "status": 200,
    "accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2huLmRvZUBleGFtcGxlLmNvbSIsImlhdCI6MTY3NjI5NDE2MH0.Jqm8I878tdYlQ4a2cuj4jAg4Ai9W5gBs65DRTAD8z1c"
}
```


