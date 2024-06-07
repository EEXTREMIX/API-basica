from flask import Flask, jsonify, request

app = Flask(__name__)

# Rutas de ejemplo
@app.route('/')
def home():
    return "¡Bienvenido a la API!"

@app.route('/api/saludo', methods=['GET'])
def saludo():
    return jsonify({"mensaje": "¡Hola, mundo!"})

# Ruta para recibir datos y responder
@app.route('/api/echo', methods=['POST'])
def echo():
    data = request.get_json()
    return jsonify(data)

if __name__ == '__main__':
    app.run(debug=True)
