# Spring Boot Docker Ansible

In this project, you will build a demo Spring Boot application running inside a Docker container, by just simply execute
 the Ansible script.
 
### Stack

- Ansible
- Docker
- Java
- Spring Boot
- Gradle

## Getting Started

### Prerequisites

* CentOS 7.9 with the root permission
* Ansible latest stable version (The project is tested on Ansible 4.10)
* Docker and JDK are not mandatory, the Ansible script would install them for you if needed.

### Run

* Run command 
```
sudo ansible-playbook playbook.yml
```

* Test dockerized app by passing your name as the parameter, e.g.
```
curl http://localhost:8080/Joe
```



