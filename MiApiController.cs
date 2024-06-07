using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("api")]
public class MiApiController : ControllerBase
{
    [HttpGet("saludo")]
    public IActionResult Saludo()
    {
        return Ok(new { mensaje = "¡Hola, mundo!" });
    }

    [HttpPost("echo")]
    public IActionResult Echo([FromBody] object data)
    {
        return Ok(data);
    }

    [HttpGet("suma/{a}/{b}")]
    public IActionResult Suma(int a, int b)
    {
        return Ok(new { resultado = a + b });
    }

    [HttpGet("multiplica")]
    public IActionResult Multiplica([FromQuery] int a, [FromQuery] int b)
    {
        return Ok(new { resultado = a * b });
    }
}
