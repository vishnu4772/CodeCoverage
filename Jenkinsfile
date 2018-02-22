pipeline {
  agent none
  stages {
    stage('build') {
       steps {
        echo 'this is minimal pipeline'
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
