
# User Management System

This is basic user management application using spring boot. This application will provide different REST endpoints to manager user data.


## REST APIs

#### Get all users

```http
  GET /users
```
#### Get user by id

```http
  GET /users/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of user to fetch |

#### Get user by name

```http
  GET /users/username/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `String` | **Required**. Name of user to fetch |

#### Create user

```http
  POST /users
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `user`      | `User` | **Required**. Details of user. |

#### Delete user by id

```http
  DELETE /users/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of user which we want to delete. |


### Running Examples
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Intellij 
   - File -> New -> Project from Existing Sources -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application
- You are all Set
## Authors

- [@ssatardekar](https://www.github.com/ssatardekar)

