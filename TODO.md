### 1. input
- 코치 이름 입력받기
- 코치별 못 먹는 메뉴 입력

### 2. output
- 서비스 시작 문구
- 서비스 종료 문구

### 3. domain
**3.1 코치**
- 이름
  - 2글자 ~ 4글자
- 먹은 메뉴
  - 먹을 때마다 추가
- 못 먹는 메뉴
  - 0개~2개
- getter

**3.2 카테고리**
- enum으로
- 일식-1, 한식-2, 중식-3, 아시안-4, 양식-5
- 메뉴 리스트
- getter

**3.3 메뉴**
- 이름
- getter

### 4. 예외처리
**4.1. 코치 입력 오류**
- null일 경우
  - "[ERROR] name can not null"
- 입력 없을 경우
  - "[ERROR] name can not blank"
- 이름 2글자 미만일 경우
  - "[ERROR] input at least two letter"
- 이름 4글자 초과일 경우
  - "[ERROR] input limit is four"
- 코치 2명 미만일 경우
  - "[ERROR] input at least two coach"
- 코치 5명 초과일 경우
  - "[ERROR] input limit is five"

**4.2. 못 먹는 메뉴 입력 오류**
- null일 경우
  - "[ERROR] menu can not null"
- 2개 초과일 경우
  - "[ERROR] input limit is two"
- 리스트에 없는 메뉴 입력
  - "[ERROR] menu is not listed"