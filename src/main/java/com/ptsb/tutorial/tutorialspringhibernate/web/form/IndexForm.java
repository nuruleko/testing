package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.ptsb.tutorial.tutorialspringhibernate.domain.Pengguna;

@ManagedBean
@ViewScoped
public class IndexForm extends BaseForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean click;
	private String pengguna;
	private String password;

	@PostConstruct
	public void initForm() {

	}

	public void onLogIn() {
		Pengguna pengguna = getDmsManager().findPenggunaByEmail(this.pengguna);
		if (pengguna != null && this.password.equals(pengguna.getPassword())) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO, "Info", "Sila Masuk"));
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO, "Ralat",
					"Sila Masukkan Semula Email Dan Kata Laluan"));
		}
	}

	public void onClick() {
		if (this.click) {
			this.click = false;
		} else {
			this.click = true;
		}
	}

	public boolean isClick() {
		return click;
	}

	public void setClick(boolean click) {
		this.click = click;
	}

	public String getPengguna() {
		return pengguna;
	}

	public void setPengguna(String pengguna) {
		this.pengguna = pengguna;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
