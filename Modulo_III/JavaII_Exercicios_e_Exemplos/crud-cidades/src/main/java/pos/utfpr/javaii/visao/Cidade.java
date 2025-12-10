package pos.utfpr.javaii.visao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public final class Cidade {

  @NotBlank(message = "Nome da cidade deve ser informado")
  @Size(min = 5, max = 60, message = "{app.cidade.size}")
  private final String nome;

  @NotBlank(message = "Sigla do estado deve ser informado")
  @Size(min = 2, max = 2, message = "{app.estado.size}")
  private final String estado;

  public Cidade(final String nome, final String estado) {
    this.nome = nome;
    this.estado = estado;
  }

  public String getEstado() {
    return this.estado;
  }

  public String getNome() {
    return this.nome;
  }
}
