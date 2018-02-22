pipeline {
  agent none
  stages {
    stage('build') {
      agent any
      steps {
        sh 'mvn clean install'
      }
    }
    stage('test') {
      steps {
        sh 'echo "this is a test phase"'
      }
    }
    stage('signoff') {
      steps {
        sh 'echo "this is a shgnoff"'
      }
    }
  }
}