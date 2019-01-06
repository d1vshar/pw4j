package io.github.adorableskullmaster.pw4j.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.pw4j.domains.subdomains.ApplicantNationsContainer;

import java.util.List;

public class Applicants extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<ApplicantNationsContainer> applicants = null;

  public boolean isSuccess() {
    return success;
  }

  public List<ApplicantNationsContainer> getApplicants() {
    return applicants;
  }
}
