from flask import Flask, render_template

# Flask는 Flask 객체를 먼저 생성한다
app = Flask(__name__)


#──────────────────────────────────────
# 호출되는 주소를 적어준다.
@app.route('/')

# root 페이지 호출시 처리하는 함수 처리
def index():
    return render_template('index.html')
#──────────────────────────────────────
@app.route('/main')
def main():
    return 'main!'

# app을 run한다.
# 자기가 스스로 동작한다면 __main__이 들어간다.
# debug=True로 주면 서버를 재시작 안하더라도 새로고침으로 변경사항을 바로 확인 할 수 있다.
if __name__ == '__main__':
    app.run(debug=True,port=80)

# static js, css file
# templates html file
# flask에서는 위의 두개의 디렉토리를 자동으로 인식하므로 따로 path를 설정할 필요가 없다.
