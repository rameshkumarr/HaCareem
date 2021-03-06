package com.careem.engine.web.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class EngineUserDetails implements UserDetails {

	private static final long serialVersionUID = -9121274038630191739L;
	
	private String username;
	private String password;
	private Long userId;
	private Boolean accountNonExpired;
	private Boolean accountNonLocked;
	private Boolean credentialsNonLocked;
	private Boolean enabled;
	private List<SimpleGrantedAuthority> authorities;
	
	public EngineUserDetails(String username, String password,
			Boolean accountNonExpired, Boolean accountNonLocked,
			Boolean credentialsNonLocked, Boolean enabled,
			List<SimpleGrantedAuthority> authorities,
			Long userId) {
		this.username = username;
		this.password = password;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonLocked = credentialsNonLocked;
		this.enabled = enabled;
		this.authorities = authorities;
		this.userId = userId;
	}
	
	@Override
	public Collection< ? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonLocked;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}