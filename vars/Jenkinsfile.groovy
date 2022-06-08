/*@Library('my-shared-library2')_*/

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo"{config.message}"
            }
        }
    }
}
