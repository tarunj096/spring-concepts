### Scopes of Bean

- Singleton - Only one Instance of spring bean will be created for spring container.
  
- Prototype - A new instance will be created every time the bean is requested from the spring container.

- Request - new instance of the bean will be created for each http session 

- Session - A new bean will be created for each http session by the container

- Application - the application scope creates the bean instance for the lifecycle of a ServletContext

