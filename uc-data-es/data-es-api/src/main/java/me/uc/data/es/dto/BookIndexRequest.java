package me.uc.data.es.dto;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author uc
 * @description TODO
 * @date 2019/8/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookIndexRequest {

	@NotBlank
	private String name;

	private String author;

	@Length(min = 5)
	private String isbn;
}
