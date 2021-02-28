package com.complejo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryFactory {

  @Autowired
  private RepositoryUsers repositoryUsers;

  @Autowired
  private RepositoryResources repositoryResources;

  @Autowired
  private RepositoryBookings repositoryBookings;

  @Autowired
  private RepositoryHoursIntervals repositoryHoursIntervals;

  @Autowired
  private RepositoryBillForPost repositoryBillForPost;

  @Autowired
  private RepositoryBillsDetail repositoryBillsDetail;

  /**
   *.
   * @param entityName.
   * @return JpaRepository.
   */
  public JpaRepository getRepository(String entityName) {
    switch (entityName) {
      case "user":
        return repositoryUsers;
      case "resource":
        return repositoryResources;
      case "booking":
        return repositoryBookings;
      case "hoursInterval":
        return repositoryHoursIntervals;
      case "billForPost":
        return repositoryBillForPost;
      case "billDetail":
        return repositoryBillsDetail;
      default:
        return repositoryUsers;
    }
  }
}
