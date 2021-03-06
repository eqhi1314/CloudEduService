package com.cloudedu.serviceutil.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum recruitTypeEnum {

	LECTURER(1, "讲师招募"), AGENT(2, "代理招募");

	private Integer code;

	private String desc;

}
