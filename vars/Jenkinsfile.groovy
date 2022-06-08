/*@Library('my-shared-library2')_*/
def call (body){
    def config =[:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()
    
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
}
