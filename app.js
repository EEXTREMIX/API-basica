const express = require('express');
const app = express();

app.use(express.json());

app.get('/', (req, res) => {
    res.send('¡Bienvenido a la API!');
});

app.get('/api/saludo', (req, res) => {
    res.json({ mensaje: '¡Hola, mundo!' });
});

app.post('/api/echo', (req, res) => {
    res.json(req.body);
});

app.get('/api/suma/:a/:b', (req, res) => {
    const { a, b } = req.params;
    const resultado = parseInt(a) + parseInt(b);
    res.json({ resultado });
});

app.get('/api/multiplica', (req, res) => {
    const a = parseInt(req.query.a);
    const b = parseInt(req.query.b);
    const resultado = a * b;
    res.json({ resultado });
});

app.listen(3000, () => {
    console.log('API ejecutándose en http://localhost:3000');
});
