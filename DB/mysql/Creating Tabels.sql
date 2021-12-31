# If you faced a proplem please create the departments table first them create the rest
#----------------------------------------------------------
# Creating departments tabel
#----------------------------------------------------------
CREATE TABLE IF NOT EXISTS `students_affairs`.`departments` (
  `department_id` VARCHAR(3) NOT NULL,
  `department_name` VARCHAR(25) NULL,
  `number_of_students` INT NULL,
  PRIMARY KEY (`department_id`))
ENGINE = InnoDB;
#----------------------------------------------------------
# Creating courses tabel
#----------------------------------------------------------
CREATE TABLE IF NOT EXISTS `students_affairs`.`courses` (
  `course_id` VARCHAR(8) NOT NULL,
  `course_name` VARCHAR(40) NULL,
  `course_pre_id` VARCHAR(5) NULL,
  `course_department` VARCHAR(3) NULL,
  `course_level` INT NULL,
  `course_term` INT NULL,
  PRIMARY KEY (`course_id`),
  INDEX `course_department_idx` (`course_department` ASC) VISIBLE,
  INDEX `course_pre_id_idx` (`course_pre_id` ASC) VISIBLE,
  CONSTRAINT `course_department`
    FOREIGN KEY (`course_department`)
    REFERENCES `students_affairs`.`departments` (`department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `course_pre_id`
    FOREIGN KEY (`course_pre_id`)
    REFERENCES `students_affairs`.`courses` (`course_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
#----------------------------------------------------------
# Creating Students tabel
#----------------------------------------------------------
CREATE TABLE IF NOT EXISTS `students_affairs`.`students` (
  `national_id` VARCHAR(20) NOT NULL,
  `department_id` VARCHAR(3) NULL,
  `email` VARCHAR(25) NULL,
  `password` VARCHAR(25) NULL,
  `first_name` VARCHAR(25) NULL,
  `last_name` VARCHAR(25) NULL,
  `address` VARCHAR(45) NULL,
  `level` INT NULL,
  `term` INT NULL,
  `gpa` DECIMAL(3,2) NULL,
  `passed_courses_id` VARCHAR(320) NULL,
  PRIMARY KEY (`national_id`),
  INDEX `department_id_idx` (`department_id` ASC) VISIBLE,
  CONSTRAINT `department_id`
    FOREIGN KEY (`department_id`)
    REFERENCES `students_affairs`.`departments` (`department_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB