pipeline {
  agent any
  parameters{
          choice(choices: ['Chrome','microsoftedge'], description: '', name: 'Browser')
          booleanParam(name: 'Lanzarjobselenium', defaultValue: true, description: '')
  }
  stages {
    stage('Verify browsers are installed') {
      steps {
        sh 'google-chrome --version'
        sh 'firefox --version'
      }
    }
    stage('selenium') {
        when {
            expression { params.Lanzarjobselenium }
        }
        steps{
            build job: 'selenium', parameters: [string(name: "DESCRIPTION", value: params.DESCRIPTION), string(name: 'test', value: '')],propagate:false
        }
    }
    stage('Run Tests') {
      steps {
        sh './mvnw clean test'
      }
    }
  }
}