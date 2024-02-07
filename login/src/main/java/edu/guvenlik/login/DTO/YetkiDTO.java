package edu.guvenlik.login.DTO;

public class YetkiDTO {
    private Long num;
    private String yetkiAd;

    public YetkiDTO(Long num, String yetkiAd) {
        this.num = num;
        this.yetkiAd = yetkiAd;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getYetkiAd() {
        return yetkiAd;
    }

    public void setYetkiAd(String yetkiAd) {
        this.yetkiAd = yetkiAd;
    }
}
