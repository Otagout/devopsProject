pipeline {
    agent any

    stages {

        stage('Selenium UI Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('API Tests') {
            steps {
                sh 'newman run Reqres_API_Tests.postman_collection.json'
            }
        }
    }

    post {
        always {
            echo 'QA pipeline completed.'
        }
    }
}