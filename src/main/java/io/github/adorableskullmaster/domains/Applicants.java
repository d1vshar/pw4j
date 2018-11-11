package io.github.adorableskullmaster.domains;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.github.adorableskullmaster.domains.subdomains.ApplicantNations;

import java.util.List;

public class Applicants extends Entity {
  @SerializedName("success")
  @Expose
  private boolean success;
  @SerializedName("nations")
  @Expose
  private List<ApplicantNations> applicants = null;

  public boolean isSuccess() {
    return success;
  }

  public List<ApplicantNations> getApplicants() {
    return applicants;
  }
}
