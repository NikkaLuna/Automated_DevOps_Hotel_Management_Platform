# Automated DevOps Hotel Management Platform

## Description

*(In Progress)*

The Automated DevOps Hotel Management Platform is a web-based solution that leverages Java Spring Boot for the backend and Angular for the frontend. It supports multilingual capabilities (English and French), diverse currency displays, and time zone conversions for live presentations.

Infrastructure automation is achieved through Terraform for efficient AWS resource provisioning. Docker is used for containerization, and Kubernetes (AWS EKS) is used for orchestration. CI/CD pipelines are implemented using Jenkins for automated deployments from version control to local environments.


## Screenshots

![Hotel Scheduling Application](https://github.com/NikkaLuna/Automated_DevOps_Hotel_Management_Platform/blob/main/Hotel%20Scheduling%20Application.png)

*This screenshot shows the main interface of the application where users can book rooms, view available rooms with prices in different currencies, and find information about a live presentation being presented at the hotel.*

<br>

![Docker Deployment](https://github.com/NikkaLuna/Automated_DevOps_Hotel_Management_Platform/blob/main/Docker%20Deployment.png)

*This screenshot shows the Docker Desktop interface with the running container and the Landon Hotel application accessible via `localhost:8080`. It demonstrates the containerization and deployment of the application using Docker.*

<br>


## Features

- **Localization & Internationalization:** Supports both English and French.
- **Currency Display:** Shows reservation prices in USD, CAD, and EUR.
- **Time Zone Conversion:** Converts times between ET, MT, and UTC for live presentations.
- **MultiThreading:** Implements multithreaded programming in Java, adhering to industry best practices for thread safety, synchronization, and efficient resource management.
- **JPA Integration:** Utilizes JPA to define the data model and persistence logic for entities.
- **Spring MVC REST API:** Couples JPA with Spring MVC annotations to expose REST API endpoints for effective management of hotel reservations.
- **Containerization & Cloud Deployment:** Leverages Docker for containerized deployment to cloud services, enabling streamlined workflows.
- **Infrastructure Automation:** Utilizes Terraform for provisioning AWS resources efficiently.
- **Deployment Automation:** Employs Ansible for container orchestration and deployment.
- **Continuous Integration & Delivery:** Leverages Jenkins for continuous integration and automated testing, ensuring consistent and reliable deployments.

<br>

## Technologies Used
- **Backend**: Java Spring Boot, Spring MVC, Spring Data JPA
- **Frontend**: Angular
- **Database**: MySQL, H2
- **Infrastructure**: Terraform, AWS
- **AWS**: VPCs, subnets, security groups, NAT gateways, EKS clusters, RDS instances, IAM roles and policies, and multi-AZ deployment
- **Containerization and Deployment**: Docker, Kubernetes
- **CI/CD**: Jenkins

<br>

## Setup and Installation

### Prerequisites

- Java Development Kit (JDK) 17
- Node.js and npm
- Angular CLI
- Maven
- MySQL
- Docker
- Terraform


1. **Clone the repository**:
    ```bash
    git clone https://github.com/NikkaLuna/Automated_DevOps_Hotel_Management_Platform.git
    ```

2. **Set up the backend**:
    - Navigate to the project root directory:
      ```bash
      cd path/to/your/cloned/repo/Hotel-Reservation-Management-System
      ```
    - Build the project using Maven:
      ```bash
      ./mvnw clean install
      ```
    - Run the Spring Boot application:
      ```bash
      java -jar D387_sample_code-0.0.2-SNAPSHOT.jar
      ```

3. **Set up the frontend**:
    - Navigate to the UI directory:
      ```bash
      cd src/main/UI
      ```
    - Install dependencies and start the development server:
      ```bash
      npm install
      npx ng serve
      ```


4. **Dockerize the application**:
    - Build and run the Docker containers:
      ```bash
      docker-compose up --build
      ```

The application should now be running with the backend accessible at http://localhost:8080 and the frontend accessible at http://localhost:4200.

## Infrastructure Provisioning

- **Provision AWS resources using Terraform**:
  - Initialize Terraform and apply configuration:
    ```bash
    cd terraform
    terraform init
    terraform apply
    ```

This sequence allows you to ensure that the required AWS infrastructure is in place before deploying your application, reducing the risk of encountering infrastructure-related issues during deployment.

## Deployment

- **Deploy with Jenkins**:
  - Use Jenkins pipelines for continuous integration and deployment. Example Jenkinsfile (this will be updated upon project completion):
    ```groovy
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    script {
                        // Build steps
                        sh 'mvn clean package'
                    }
                }
            }
            stage('Docker Build') {
                steps {
                    script {
                        // Docker build steps
                        sh 'docker build -t your-image-name .'
                    }
                }
            }
            stage('Deploy to Kubernetes') {
                steps {
                    script {
                        // Kubernetes deployment steps
                        sh 'kubectl apply -f k8s/deployment.yaml'
                    }
                }
            }
        }
    }
    ```

<br>

## Usage

- **Access the application**:
  - Backend: `http://localhost:8080`
  - Frontend: `http://localhost:4200`
  - Grafana Dashboard: `http://localhost:3000`


## Challenge
**CORS Issues**: Encountered difficulties with Cross-Origin Resource Sharing (CORS) when setting up and integrating the Angular frontend with the backend REST API, which prevented the frontend from making requests to the backend due to security restrictions.

### Solution:
**CORS Configuration**: Resolved the issue by configuring CORS settings in the Spring Boot application, allowing the Angular frontend to communicate with the backend REST API.

<br>

## Contribution Guidelines

Contributions are encouraged under the following conditions:

- Adherence to the project's core requirements and design.
- Commitment to maintaining the integrity and authenticity of the work.
- Alignment with the overall objectives of the Hotel scheduling application project.



## Authors

- [@NikkaLuna](https://github.com/NikkaLuna)


## 🚀 About Me
I'm a Software Engineer with an emphasis on Java, SQL, and AWS.  


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/andrea-hayes-msml/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/AHayes_Ninja_)
[![art portfolio](https://img.shields.io/badge/my_art-888?style=for-the-badge&logo=ko-fi&logoColor=white)](https://andreachristinehayes.wixsite.com/andreahayesart/)



