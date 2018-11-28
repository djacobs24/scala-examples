package models

/**
 *  PrimeColor represents valid prime colors
 */
sealed trait PrimeColor

case object Red extends PrimeColor
case object Blue extends PrimeColor
case object Yellow extends PrimeColor
