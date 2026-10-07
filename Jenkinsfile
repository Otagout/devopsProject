pipeline {
    agent any

    stages {

        stage('Selenium UI Tests') {
            steps {
                bat '.\\mvn.cmd clean test'
            }
        }

        stage('API Tests') {
            steps {
                bat 'newman run Reqres_API_Tests.postman_collection.json'
            }
        }
    }

    post {
        always {
            echo 'QA pipeline completed.'
        }
    }
}