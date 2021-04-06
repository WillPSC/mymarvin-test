job('Disk Space Check') {
  steps {
    shell('df')
  }
}


