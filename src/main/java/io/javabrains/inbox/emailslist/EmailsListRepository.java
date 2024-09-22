package io.javabrains.inbox.emailslist;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailsListRepository extends CassandraRepository<EmailsList, EmailsListPrimaryKey>  {
    List<EmailsList> findAllById_UserIdAndId_Label(String userId, String label); 
}
