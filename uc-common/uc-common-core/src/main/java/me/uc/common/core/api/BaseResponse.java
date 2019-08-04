package me.uc.common.core.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse<T> {
	@Builder.Default
	private ResultCode code = ResultCode.SUCCESS;

	private String message;

	private T data;

	public boolean isSuccess() {
		return code == ResultCode.SUCCESS;
	}
}