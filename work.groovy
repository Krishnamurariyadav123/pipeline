pipeline {
    agent any
   
    stages {
        stage('Example') {
            steps {
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/Krishnamurariyadav123/pipeline.git'
                echo 'Pull Successfully'
            }
        }
    }
}