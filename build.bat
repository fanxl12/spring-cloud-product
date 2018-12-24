mvn clean package -Dmaven.test.skip=true -U

docker build -t registry.cn-shanghai.aliyuncs.com/guijj12/spring-cloud-product .

docker push registry.cn-shanghai.aliyuncs.com/guijj12/spring-cloud-product