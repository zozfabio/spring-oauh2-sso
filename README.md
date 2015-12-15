# Simple Spring Boot OAuth2 SSO Example

cd spring-oauth2-sso/Autorization
mvn spring-boot:run

cd spring-oauth2-sso/Client
mvn spring-boot:run

> Access localhost:8080 (Client) 
> Redirects to localhost:8081 (Autorization) 
> Type it username: user password: userpass 
> Redirect back to localhost:8080, see Hello World.
