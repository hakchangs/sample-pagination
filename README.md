# Pagination 공통구현
`jpa`, `mybatis` 에서 공통사용할 수 있는 페이지네이션을 구현한다.
* Pagination 공통처리
* Rest 응답 공통처리 (페이지네이션 연관)

| 주의 - 아래 내용은 공통처리 LIB 보다는 사용 가이드에 가깝다.

## 프로젝트 구성
* `rest-core` - Rest 에 대한 공통처리를 담당하는 LIB.
    * 공통 메시지 처리: 성공 메시지, 에러 메시지
    * 페이지 응답처리: 페이지 응답 DTO 정의
* `jpa` - JPA 사용 예시
    * `Specification` 을 통해 조건쿼리를 처리한다.
* `mybatis` - MyBatis 사용 예시
    * count 쿼리, list 쿼리 예시를 제공한다.
    * Mapper 이외에 Repository 를 두어 `jpa` 와 같은 인터페이스를 갖는다. (`CrudRepository`)
