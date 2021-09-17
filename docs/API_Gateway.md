## API Gateway 란?
API Gateway 서비스는 사용자가 설정한 라우팅 설정에 따라 각각 엔드포인트로 클라이언트 대신 받고 전달해주는 Proxy 역할
외부 요청에 따라 적절한 형태로 원하는 형태의 반응가능

## 역할
- 인증 및 권한 부여
- 서비스 검색 통합
- 응답 캐싱
- 정책, 회로 차단기 및 Qos 다시 시도
- 속도 제한
- 부하 분산
- 로깅, 추적, 상관관계
- 헤더, 쿼리 문자열 및 청구 변환
- IP허용 목록에 추가

## Netflix Zuul
- Routing
- API Gateway
- 2.4에서 Maintenance상태(더 이상 지원 보류)

## Netflix Ribbon : ClientSide Load Balancer
1) RestTemplate
2) Feign Client(폐인 클라이언트)

- 클라이언트에 존재
- 서비스 이름으로 호출
- Health Check
- 2.4에서 Maintenance상태(더 이상 지원 보류)

-> 장점) MSA 이름만 가지고 호출가능
-> 단점) 비동기에 좋지 않음 (요즘에 많이 사용하지 않는다)