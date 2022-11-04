package kodlama.io.devs.business.requests;

import kodlama.io.devs.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrameworkRequest {
    private int id;
    @NotNull
    private String name;
    @NotNull
    private LanguageRequest languageRequest;
}
