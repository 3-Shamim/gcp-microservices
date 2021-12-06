### Docker build
```
./mvnw clean install dockerfile:build
```

### Docker push
```
docker login
./mvnw clean install dockerfile:push

or

./mvnw clean install dockerfile:push -Ddockerfile.username=username -Ddockerfile.password=password
```