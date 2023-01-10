package br.com.joshaby.RegistrationSystem.infra.adapters;

import br.com.joshaby.RegistrationSystem.application.contracts.RegistrationToHtmlConverter;
import br.com.joshaby.RegistrationSystem.application.contracts.Storage;
import com.itextpdf.html2pdf.HtmlConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

@Service
@RequiredArgsConstructor
public class LocalStorageAdapter implements Storage {

    private final RegistrationToHtmlConverter registrationToHtml;

    @Override
    public void store(String filename, String path, String content) throws IOException {

        String fileNameWithoutExtension = filename.substring(0, filename.length() - 4);
        File file = new File( path + fileNameWithoutExtension + ".html");
        FileWriter fileWriter = new FileWriter(file);
        if (!file.createNewFile()) {
            fileWriter.write("");
        }
        fileWriter.write(content);
        fileWriter.close();
        HtmlConverter.convertToPdf(new File(path + fileNameWithoutExtension + ".html"),
                new File(path + filename));
        file.delete();
    }
}
