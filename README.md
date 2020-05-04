### step1
- 책장에 있는 책 목록을 DB로 관리한다.
```
create table books (
    id bigint auto_increment primary key,
    name varchar(65) not null,
    author varchar(65));
```