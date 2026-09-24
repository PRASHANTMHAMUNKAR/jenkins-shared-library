def call(string imageTag, string imageName) {
  "sh docker build -t ${imageName}:${imageTag} ."
}
