package pl.krzysiek.olejnik.dmkatalogue.converter;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
@ConfigurationPropertiesBinding
public class MultipartFileConverter implements Converter<MultipartFile, String> {

	@Override
	public String convert(MultipartFile file) {
		return file.getOriginalFilename();
	}
}
