package edu.iti;

def install_mvn(commandOption){
    sh "mvn ${commandOption}"
}

def test_mvn(noInput){
    sh "mvn test"
}