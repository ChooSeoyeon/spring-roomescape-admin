# 기능 구현

## 1단계 - 홈 화면

- [x] `/admin` 요청 시 어드민 메인 페이지를 응답한다.
  - `templates/admin/index.html`

## 2단계 - 예약 조회

- [ ] `/admin/reservation` 요청 시 예약 관리 페이지를 응답한다.
  - `templates/admin/reservation-legacy.html`
- [ ] 예약 관리 페이지 로드 시 `예약 목록 조회 API`를 호출한다.


# API 명세

## 예약 목록 조회 API
Request
```
GET /reservations HTTP/1.1
```

Response
```
HTTP/1.1 200
Content-Type: application/json

[
    {
        "id": 1,
        "name": "브라운",
        "date": "2023-01-01",
        "time": "10:00"
    },
    {
        "id": 2,
        "name": "브라운",
        "date": "2023-01-02",
        "time": "11:00"
    }
]
```