package cn.edu.tju.tiei.logistics.dao;

import cn.edu.tju.tiei.logistics.model.Shipper;
import cn.edu.tju.tiei.logistics.model.ShipperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShipperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    long countByExample(ShipperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int deleteByExample(ShipperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int insert(Shipper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int insertSelective(Shipper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    List<Shipper> selectByExample(ShipperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    Shipper selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Shipper record, @Param("example") ShipperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Shipper record, @Param("example") ShipperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Shipper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shipper
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Shipper record);
}