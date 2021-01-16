package com.vijen.app.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vijen.app.domain.DataExtractDto;

@Repository
public interface DataExtractRepository extends CrudRepository<DataExtractDto, Long> {
	@Query("select e from DTOECEDetails e where year(e.ececreated_date) = ?1 and month(e.ececreated_date) = ?2")
	List<DataExtractDto> getByYearAndMonth(Integer year, Integer month);

	@Query("select e from DTOECEDetails e where year(e.ececreated_date) = ?1 and month(e.ececreated_date) = ?2 and day(e.ececreated_date)=?3 and hour(e.ececreated_date)=?4 ")
	List<DataExtractDto> getByYearAndMonthAndDayAndHour(Integer year, Integer month, Integer day, Integer hour);

}
