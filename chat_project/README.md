# 📢 채팅 Toy Project


## 목차
- [기본 기능](#기본-기능)
- [채팅방 관리 기능](#채팅방-관리-기능)
- [추가 기능](#추가-기능)

<br>

## 기본 기능
### 1. 서버 연결 및 닉네임 설정
- 클라이언트는 12345 포트로 대기 중인 ChatServer에 접속합니다. <br>
- 서버에 접속하면, 사용자는 닉네임을 입력받아 서버에 전송합니다. <br>
- 서버는 사용자의 닉네임을 받고 "OOO 닉네임의 사용자가 연결했습니다."라고 출력합니다. <br>
- 클라이언트가 접속하면 서버는 사용자의 IP 주소를 출력합니다. <br>

### 2. 메시지 수신 및 발신
- 클라이언트는 닉네임을 입력한 후부터 서버로부터 메시지를 한 줄씩 받아 화면에 출력합니다. <br>
- 사용자가 메시지를 입력하면 서버에 전송합니다. <br>
- 사용자가 "/bye"를 입력하면 연결을 종료하고 프로그램을 종료합니다.
- 서버도 "OOO 닉네임의 사용자가 연결을 끊었습니다."를 출력하고 연결을 종료합니다. <br>

<br>

## 채팅방 관리 기능
### 1. 명령어 모음

- 서버는 클라이언트가 접속하면 아래 명령어들을 클라이언트에게 전송합니다:
    
    ```
    방 목록 보기 : /list
    방 생성 : /create
    방 입장 : /join [방번호]
    방 나가기 : /exit
    접속종료 : /bye
    ```
    
### 2. 대화방 생성

- 클라이언트가 "/create"를 입력하면 서버는 새 방을 생성하고 클라이언트를 그 방으로 이동시킵니다. <br>
- 방은 1부터 시작하는 번호로 관리되며, 생성 시 "방 번호 [방번호]가 생성되었습니다."를 출력합니다. <br>

### 3. 방 목록 보기

- "/list" 명령을 입력하면 서버는 생성된 모든 방의 목록을 출력합니다. <br>

### 4. 방 입장 및 나가기

- "/join [방번호]"를 통해 특정 방에 입장할 수 있습니다.
- 방에 입장하면, "닉네임이 방에 입장했습니다." 메시지를 전달합니다. <br>
- 방에서 "/exit"를 입력하면, "닉네임이 방을 나갔습니다." 메시지와 함께 로비로 이동합니다.

<br>

## 추가 기능
### 1. 중복 닉네임 방지

- 서버는 중복되지 않는 닉네임만 허용합니다.
- 이미 사용 중인 닉네임을 입력하면 경고 메시지를 보내고 다른 닉네임을 요구합니다.

### 2. 사용자 및 방 관련 정보 제공

- 기본적으로 서버에서 현재 접속 중인 사용자의 정보(id, ip address)와 접속자 수를 제공합니다.

### 3. 최대 인원 수 제한

- 방에 들어갈 수 있는 최대 인원 수를 n명으로 정하여 방의 접속자 수를 제한하였습니다.

### 4. AI 챗봇 기능
  
- AI 챗봇 기능을 추가하여 오늘의 날씨, 사용법 등 클라이언트에게 편리성을 제공하였습니다.


### 5. 귓속말 기능

- "/whisper [닉네임] [메시지]" 명령을 사용하여 특정 사용자에게만 메시지를 전송할 수 있습니다. 
- 방 내에서도 같은 명령을 사용하여 특정 닉네임에게만 메시지를 보낼 수 있습니다.

<!--
### 6. 채팅 내역 저장 기능

- 유저 간 채팅에 작성한 내용들을 파일로 만들어 채팅 내역을 확인할 수 있게 만듭니다.

### 7. 비밀 방 생성

- 비밀 방을 생성하여 비밀번호를 알고 있는 클라이언트만 접속이 가능합니다.

-->