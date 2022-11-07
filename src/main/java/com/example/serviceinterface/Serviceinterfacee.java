package com.example.serviceinterface;

import com.example.entity.userentities;

public interface Serviceinterfacee {

	String adduser(userentities userentities);
	userentities getuser(Long id);
	String updateuser(userentities userentities);
}
