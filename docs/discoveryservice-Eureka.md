## CLI로 maven build 후 실행
mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=9003'
server.port를 0번 = 랜덤포트 실행