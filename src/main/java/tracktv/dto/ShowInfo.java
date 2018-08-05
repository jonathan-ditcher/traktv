package tracktv.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jonathan Ditcher on 05/08/2018.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ShowInfo extends HeaderInfo {

    private Show show;

    public ShowInfo() {
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "ShowInfo{" +
                "show=" + show +
                "} " + super.toString();
    }
}
