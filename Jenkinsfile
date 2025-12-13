pipeline {
    agent any
    
    stages {
        stage('Prepare Environment') {
            steps {
                sh '''
                cd ansible
                ansible-playbook firstPlaybook.yml --tags clone
                '''
            }
        }
        
        stage('Launch Application') {
            steps {
                sh '''
                cd ansible
                ansible-playbook firstPlaybook.yml --tags start
                '''
            }
        }
    }
}